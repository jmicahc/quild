(ns quild.core
  (:require ))

(enable-console-print!)

(defonce app-state
  (atom {:width 200
         :height 300
         :background-color "red"
         :children [{:width 300
                     :height 350
                     :background-color "blue"
                     :children []}
                    {:width 250
                     :height 375
                     :background-color "red"
                     :children "red"}]}))

(defn root-interpretter [_ _ old new]
  "Unwind the new state until it is identical to the old state.")


(add-watch app-state
           :width
           root-interpretter)


#_(defmulti interpret-dom
  (fn [state id k v] k))



#_(defmulti interpret-dom :width
  ([state id k v]
   (update-in state
              [:dom-nodes id]
              (fn [node]
                (aset node (name k) v)
                node))))



#_(defmulti interpret-dom :height
  ([state id k v]
   (update-in state
              [:dom-nodes id]
              (fn [node]
                (aset node (name k) v)
                node))))



#_(defmulti interpret-dom :background-color
  ([state id k v]
   (update-in state
              [:dom-nodes id]
              (fn [node]
                (aset node (name k) v)
                node))))



#_(defn diff-children [state id children]
  state)



#_(defmulti interpret-dom :children
  ([state id k v]
   (diff-children state id v)))



(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
  )
